import zio._

object Main extends App {
  def run(args: List[String]): zio.URIO[zio.ZEnv,zio.ExitCode] = URIO(ExitCode.success)
}
