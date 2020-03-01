public class Buss extends Auto {


    abstract static public class transmissions implements IMobillity {
    }
    public static class Transmission_D extends transmissions {
        @Override
        public void Movement() {
            System.out.println("автобус движтся со скоростью " + TrafficSpeed);
        }
    }
    public static class Transmission_R extends transmissions {
        @Override
        public void Movement() {
            System.out.println("автобус движется назад со скоростью " + ReversSpeed);
        }
    }

    public static class Transmission_N extends transmissions {
        @Override
        public void Movement() {
            System.out.println("автобус движется со скоростью  " + ParkingSpeed + mode_2);
        }
    }
    public static class Transmission_P extends transmissions {
        @Override
        public void Movement() {
            System.out.println("автобус не движется  " + mode_1);
        }
    }
    public static class Radio extends Outside_noise {
        @Override
        public void Sound() {
            System.out.println("* звуки лезгинки в салоне *");
        }
    }
    public static class Interior_lighting extends Inside_light {
        @Override
        public void Illumination() {
            System.out.println("освещение салона работает ");
        }
    }
    public static class Head_Lights extends Outside_light {
        @Override
        public void Illumination() {
            System.out.println("фары работают ");
        }
    }
    public static class Horn extends Inside_noise {
        @Override
        public void Sound() {
            System.out.println("*звуки клаксона *");

        }
    }
}
 abstract class Auto  {
    interface IMobillity {
     void Movement();

     int MaxSpeed = 140;
     int TrafficSpeed = 60;
     int ParkingSpeed = 0;
     String mode_1 = " автобиль зафиксирован на месте ";
     String mode_2 = " автобиль не зафиксирован на месте ";
     int ReversSpeed = 20;

 }

     interface ILight {
         void Illumination();
     }

     interface INoise {
         void Sound();
     }

}

 abstract class Outside_noise implements Auto.INoise {
}

abstract class Inside_noise implements Auto.INoise {
}

abstract class Inside_light implements Auto.ILight {
}

abstract class Outside_light implements Auto.ILight {
}