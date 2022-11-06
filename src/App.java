import java.util.ArrayList;

import javax.swing.JOptionPane;
public class App {
    static ArrayList<Veiculo> listaCarros = new ArrayList<Veiculo>();
    public static void main(String[] args) throws Exception {
       
        String menu = "[1] Adicionar\n[2] Remover\n[3] Listar\n[4] Alterar\n[5] Pesquisar";
		boolean cont = true;
		
		while(cont) {
			String escolha = JOptionPane.showInputDialog(menu);
			switch(escolha) {
			case "1":
				cadastrarVeiculo();
				break;
            case "2":
                removerVeiculo();
                break;
            case "3":
                listaVeiculos();
                break;
            case "4":
                alterarVeiculo();
                break;
			case "5":
				buscarVeiculo();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção valida");
			}
		}

	}
	
	public static void cadastrarVeiculo() {
		Veiculo veiculo = new Veiculo();
		int j = 0;
		String nome = JOptionPane.showInputDialog("Digite o nome do veiculo");
		String cor = JOptionPane.showInputDialog("Digite a cor do veiculo");
		String placa = JOptionPane.showInputDialog("Digite a placa do veiculo");
		int ano =Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veiculo"));
		for(int i=0; i<listaCarros.size();i++) {
			if(placa.equals(listaCarros.get(i).getPlaca())){
				JOptionPane.showMessageDialog(null, "Carro já está cadastrado");
			}else {
				 j++;
				 
			}
		}
		if(j == listaCarros.size()) {
			veiculo.setNome(nome);
			veiculo.setPlaca(placa);
			veiculo.setCor(cor);
			veiculo.setAno(ano);
			listaCarros.add(veiculo);
			JOptionPane.showMessageDialog(null, "Veiculo Cadastrado");
			
		}
    }

    public static void removerVeiculo(){
        if(listaCarros.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum veiculo cadastrado");
        }else{
            String placa = JOptionPane.showInputDialog("Digite a placa do veiculo que deseja remover");
            for(int i=0; i<listaCarros.size(); i++){
                if(placa.equals(listaCarros.get(i).getPlaca())){
                    listaCarros.remove(i);
					JOptionPane.showMessageDialog(null, "Veiculo Removido");
                }
            }
        }
    }
    public static void listaVeiculos(){
        
        if(listaCarros.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum veiculo cadastrado");
        }else{
            JOptionPane.showMessageDialog(null, listaCarros);
        }
    }
	public static void alterarVeiculo(){
		int s =0;
		if(listaCarros.isEmpty()){
			JOptionPane.showMessageDialog(null,"Nenhum veiculo cadastrado");
		}else{
			String placa = JOptionPane.showInputDialog("Digite a placa do veiculo que deseja alterar");
			for(int i = 0; i<listaCarros.size();i++){
				if(placa.equals(listaCarros.get(i).getPlaca())){
					String alteracao = JOptionPane.showInputDialog("O que deseja alterar?\n[1] Nome\n[2] Placa\n[3] Cor\n[4] Ano");
					switch(alteracao){
						case "1":
							String nome = JOptionPane.showInputDialog("Digite o nome:");
							listaCarros.get(i).setNome(nome);
							JOptionPane.showMessageDialog(null, "Nome do veiculo alterado");
							break;
							
						case "2":
							String plaquita = JOptionPane.showInputDialog("Digite a placa");
							for(int j = 0; j <listaCarros.size(); j++){
								if(plaquita.equals(listaCarros.get(j).getPlaca())){
									JOptionPane.showMessageDialog(null, "Essa placa já existe em outro veiculo");
								}else{
									s++;
								}
							}
							if(s == listaCarros.size()){
								listaCarros.get(i).setPlaca(plaquita); 
								JOptionPane.showMessageDialog(null, "Placa do veiculo alterado");
							}
							break;
						case "3":
							String cor = JOptionPane.showInputDialog("Digite a cor");
							listaCarros.get(i).setCor(cor);
							JOptionPane.showMessageDialog(null, "Cor do veiculo alterada");
							break;
						case "4":
							int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
							listaCarros.get(i).setAno(ano);
							JOptionPane.showMessageDialog(null, "Ano do veiculo alterado");
							break;
						default:
						JOptionPane.showInputDialog("Digite uma opção valida");
					}
				}
			}
		}
	}
	public static void buscarVeiculo(){
		int s=0;
		if(listaCarros.isEmpty()){
			JOptionPane.showMessageDialog(null,"Nenhum veiculo cadastrado para fazer a busca");
		}else{
			String placaCarro = JOptionPane.showInputDialog("Digite a placa");
			for(int i=0; i <listaCarros.size(); i++){
				if(placaCarro.equals(listaCarros.get(i).getPlaca())){
					JOptionPane.showMessageDialog(null,listaCarros.get(i));
				}else{
					s++;
				}
			}
			if(s == listaCarros.size()){
				JOptionPane.showMessageDialog(null,"Carro não encontrado");
			}
		}
	}
}
