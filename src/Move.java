public class Move {
    public static void main (String[] args){
    Buss buss = new Buss();
        Buss.Transmission_D transmission_d = new Buss.Transmission_D() ;
        Buss.Transmission_N transmission_n = new Buss.Transmission_N() ;
        Buss.Transmission_R transmission_r = new Buss.Transmission_R() ;
        Buss.Transmission_P transmission_p = new Buss.Transmission_P() ;
        Buss.Radio radio = new Buss.Radio() ;
        Buss.Horn horn = new Buss.Horn() ;
        Buss.Head_Lights head_lights = new Buss.Head_Lights();
        Buss.Interior_lighting interior_lighting = new Buss.Interior_lighting();


        transmission_d.Movement();
        transmission_n.Movement();
        transmission_r.Movement();
        transmission_p.Movement();
        radio.Sound();
        horn.Sound();
        head_lights.Illumination();
        interior_lighting.Illumination();



    }
}
