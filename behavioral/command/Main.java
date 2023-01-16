package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Light bedroom = new Light();
    Light kitchen = new Light();
    List<Light> lights = new ArrayList<>();
    lights.add(bedroom);
    lights.add(kitchen);

    Command toggleCommand = new ToggleCommand(bedroom);
    Switch lightSwitch = new Switch();

//    toggleCommand.execute();

    Command allLightsCommand = new AllLightsCommand(lights);
    lightSwitch.storeAndExecute(toggleCommand);
    lightSwitch.storeAndExecute(toggleCommand);
    lightSwitch.storeAndExecute(toggleCommand);

    lightSwitch.storeAndExecute(allLightsCommand);

  }

}
