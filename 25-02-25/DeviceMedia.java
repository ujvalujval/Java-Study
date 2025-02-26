interface MediaPlayer {

  void play();

  void pause();

  void stop();
}

class AudioPlayer implements MediaPlayer {

  public void play() {
    System.out.println("Playing Mp3 Files");
  }

  public void pause() {
    System.out.println("Pausing Mp3 Files");
  }

  public void stop() {
    System.out.println("Stoping Audio");
  }

}

class VideoPlayer implements MediaPlayer {

  public void play() {
    System.out.println("Playing Mp4 Files");
  }

  public void pause() {
    System.out.println("Pausing Mp4 Files");
  }

  public void stop() {
    System.out.println("Stoping Video");
  }

}

class StreamingPlayer implements MediaPlayer {

  public void play() {
    System.out.println("Playing Online content");
  }

  public void pause() {
    System.out.println("Pausing Online Content");
  }

  public void stop() {
    System.out.println("Stoping Online Content");
  }

}

public class DeviceMedia {
  public static void main(String[] args) {

    AudioPlayer audio = new AudioPlayer();
    audio.play();
    audio.pause();
    audio.stop();
    VideoPlayer video = new VideoPlayer();
    video.play();
    video.pause();
    video.stop();
    StreamingPlayer stream = new StreamingPlayer();
    stream.play();
    stream.pause();
    stream.stop();

  }
}
