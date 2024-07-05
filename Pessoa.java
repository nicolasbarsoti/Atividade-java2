import javax.swing.JOptionPane;

public class Pessoa{
    public  String nome;
    public int idade;
    protected double renda;

    public Pessoa () {}
    public Pessoa (String n, int t, double r) {
        this.nome = n;
        this.idade = t;
        this.renda = r;

    }
    
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null,"nome: " + nome
        + "\nidade: " + idade
        +"\nrenda: " + renda);
    }

        public String getnome(){
            return nome;
        }

        public int getidade() {
            return idade;
        }

        public double getrenda() {
            return renda;
        }

        public void setnome (String n) {
            nome = n;
        }

        public void setidade(int i) {
            idade = i;
        }

        public void setrenda (double r ) {
            renda = r;
        }

        

    }

