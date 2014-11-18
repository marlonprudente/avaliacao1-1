package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Complexo {
    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double real, double img) {
        // completar a implementação
        Complexo c = new Complexo();
        c.real = real;
        c.img = img;
    }

    // implementar getReal()
    public Complexo getReal() {
        
    }

    // implementar getImg()
    public Complexo getImg() {
        
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }
    
    // implementar sub(Complexo)
    public Complexo sub(Complexo c) {
        return new Complexo(real - c.real, img - c.img);
    }

    // implementar prod(double)
    public Complexo prod(double r) {
        return new Complexo(r * real, r * img);
    }

    // implementar prod(Complexo)
    public Complexo prod(Complexo c) {
        return new Complexo(real * c.real - img * img.c, img * c.real + real * c.img);
    }
    
    // implementar div(Complexo)
    public Complexo div(Complexo c) {
        return new Complexo((real * c.real + img * c.img)/(Math.pow(c.real,2) + Math.pow(c.img,2)) + (c.real * img - real * c.img)/(Math.pow(c.real,2) + Math.pow(c.img,2)));
    }
    
    // implementar sqrt()
    public Complexo[] sqrt() {
        // completar implementação
        // retornar o vetor contendo as raízes
        Complexo[] raizes = new Complexo[2];
        double t, s;
        if (real==0) {
            if (img==0){
                t=0;
                s=Math.PI;
            }    
            if (img>0) {
                t=(Math.PI)/4;
                s=(Math.PI)/4+ Math.PI;
            }

            if (img<0) {
                t=3*(Math.PI)/4;
                s=3*(Math.PI)/4+ Math.PI;
            }
                     
        }
        else if(real>0) {
            t = Math.atan(img/real)/2;
            s = Math.atan(img/real)/2 + Math.PI;
        }
        else if(real<0) {
            t = Math.atan(img/real)/2 + Math.PI;
            s = Math.atan(img/real)/2 + 2*Math.PI;
        }
        raizes[0] = Math.pow(Math.pow(Math.pow(real,2)+Math.pow(img,2),0.5),0.5) * (Math.cos(t) + Math.pow(-1, 0.5) * Math.sin(t));
        raizes[1] = Math.pow(Math.pow(Math.pow(real,2)+Math.pow(img,2),0.5),0.5) * (Math.cos(s) + Math.pow(-1, 0.5) * Math.sin(s));
        return null;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
