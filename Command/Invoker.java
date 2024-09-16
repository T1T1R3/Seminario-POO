import java.util.ArrayList;
import java.util.List;

public class Invoker{
  List<Command> comandosExecutados = new ArrayList<>();

  public void executarComando(Command command){
    command.execute();
    comandosExecutados.add(command);
  }

  public void desfazerComando(){
    if(!comandosExecutados.isEmpty()){
      Command ultimoComando = comandosExecutados.remove(comandosExecutados.size() - 1);
      ultimoComando.desfazer();
    }
  }
}