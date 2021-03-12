package sample;

public class TV

{


        boolean on;


             int volume;


                  int channel;

          public TV()

    {

        this.channel = 7;

              this.volume = 6;


                  this.on = false;
    }

    public boolean check_tv_on()

    {

               if (this.on == false)

        {

                       System.out.println("tv is turned on");

        }

        return this.on;

    }

}