public class Bus extends Auto {
    public void automatic_door_opening(){
        System.out.println("все двери открыты");
    }
    public void automatic_door_closure(){
        System.out.println("все двери закрыты");
    }
}




abstract class Auto extends Car {

    interface IMobillity {
     public void movement();
     public int maxSpeed = 140;
     public int trafficSpeed = 60;
    public int parkingSpeed = 0;
    public String mode_1 = " автобиль зафиксирован на месте ";
     public String mode_2 = " автобиль не зафиксирован на месте ";
    public int reversSpeed = 20;

 }

     interface ILight {
        public void illumination();
     }

     interface INoise {
         public void sound();
     }

}
abstract class Car  {
    abstract  class Transmissions implements Auto.IMobillity {
        public  class Transmission_D extends Transmissions {
            @Override
            public void movement() {
                System.out.println("автобус  движтся со скоростью " + trafficSpeed);
            }
            public   void move_at_maxsped (){
                System.out.println("автобус развивает максимальную скорость "+ maxSpeed);
            }
        }

        public  class Transmission_R extends Transmissions {
            @Override
            public void movement() {
                System.out.println("автобус движется назад со скоростью " + reversSpeed);
            }
            public  void parking_sensors(){
                System.out.println("парктроник активирован ");
            }
        }

        public  class Transmission_N extends Transmissions {
            @Override
            public void movement() {
                System.out.println("автобус движется со скоростью  " + parkingSpeed + mode_2);

            }
            public   void towing(){
                System.out.println("теперь автобус можно буксировать ");
            }
        }

        public class Transmission_P extends Transmissions {
            @Override
            public void movement() {
                System.out.println("автобус не движется  " + mode_1);
            }
            public  void  handbrake(){
                System.out.println("теперь автобус полностью неподвижно");
            }
        }
    }

    abstract class Outside_noise implements Auto.INoise {
    public  class Horn extends Outside_noise {
     @Override
     public void sound() {
         System.out.println("*звуки клаксона *");

     }
     public void car_alarm(){
         System.out.println(" работает сигнализация ");
     }
 }
}

abstract class Inside_noise implements Auto.INoise {
    public  class Radio extends Inside_noise {
    @Override
    public void sound() {
        System.out.println("* звуки лезгинки в салоне *");
    }
    public  void engine_sound_indication(){
        System.out.println("авто предупреждает звуковым сигналом о перегреве двигателя ");
    }
}
}

abstract class Inside_light implements Auto.ILight {
    public class Interior_lighting extends Inside_light {
    @Override
    public void illumination() {
        System.out.println("освещение салона работает ");
    }
    public void spedometer_display(){
        System.out.println(" работает подсветка спидометра ");
    }
}
}

abstract class Outside_light implements Auto.ILight {
    public  class Head_Lights extends Outside_light {
    @Override
    public void illumination() {
        System.out.println("фары работают ");
    }
    public void smoke_lights(){
        System.out.println(" работают противотуманные огни ");
    }
 }
  }
    }