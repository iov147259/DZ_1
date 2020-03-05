public class Move {
    public static void main (String[] args){
    Bus buss = new Bus();
        Bus.Transmission_D transmission_d = new Bus.Transmission_D() ;
        Bus.Transmission_N transmission_n = new Bus.Transmission_N() ;
        Bus.Transmission_R transmission_r = new Bus.Transmission_R() ;
        Bus.Transmission_P transmission_p = new Bus.Transmission_P() ;
        Bus.Radio radio = new Bus.Radio() ;
        Bus.Horn horn = new Bus.Horn() ;
        Bus.Head_Lights head_lights = new Bus.Head_Lights();
        Bus.Interior_lighting interior_lighting = new Bus.Interior_lighting();


        transmission_d.movement();
        transmission_n.movement();
        transmission_r.movement();
        transmission_p.movement();
        radio.sound();
        horn.sound();
        head_lights.illumination();
        interior_lighting.illumination();



    }
}
