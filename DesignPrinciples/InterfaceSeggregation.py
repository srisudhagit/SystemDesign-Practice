from abc import ABC, abstractmethod

"""
class MediaPlayer(ABC):
    @abstractmethod
    def play_audio(self, file_path: str) -> None:
        pass

    @abstractmethod
    def stop_audio(self) -> None:
        pass

    @abstractmethod
    def play_video(self, file_path: str) -> None:
        pass

    @abstractmethod
    def stop_video(self) -> None:
        pass        
        
# A class that only plays audio would be forced to implement video methods it doesn't need.
class SimpleAudioPlayer(MediaPlayer):
    def play_audio(self, file_path: str) -> None:
        print(f"Playing audio file: {file_path}")           
        
    def stop_audio(self) -> None:
        print("Stopping audio playback.")
    
    def play_video(self, file_path: str) -> None:
        raise NotImplementedError("This player does not support video playback.")
        
    def stop_video(self) -> None:
        raise NotImplementedError("This player does not support video playback.")   
        
# A class that only plays video would be forced to implement audio methods it doesn't need.
# Violation of LSP and ISP
class SimpleVideoPlayer(MediaPlayer):
    def play_audio(self, file_path: str) -> None:
        raise NotImplementedError("This player does not support audio playback.")               
        
    def stop_audio(self) -> None:
        raise NotImplementedError("This player does not support audio playback.")
        
    def play_video(self, file_path: str) -> None:   
        print(f"Playing video file: {file_path}")

    def stop_video(self) -> None:
        print("Stopping video playback.")

"""

"""# Refactored code adhering to Interface Segregation Principle
# Here, we have separated the AudioPlayer and VideoPlayer interfaces.
# Classes now only implement the methods they actually use, avoiding unnecessary method implementations.
# This way, SimpleAudioPlayer only implements audio-related methods, and SimpleVideoPlayer only implements video-related methods.
# AdvancedMediaPlayer implements both interfaces as it supports both audio and video functionalities."""

class AudioPlayer(ABC):
    @abstractmethod
    def play_audio(self, file_path: str) -> None:
        pass

    @abstractmethod
    def stop_audio(self) -> None:
        pass
    
class VideoPlayer(ABC):
    @abstractmethod
    def play_video(self, file_path: str) -> None:
        pass

    @abstractmethod
    def stop_video(self) -> None:
        pass    
    
# Implementing AudioPlayer interface
class SimpleAudioPlayer(AudioPlayer):
    def play_audio(self, file_path: str) -> None:
        print(f"Playing audio file: {file_path}")
        
    def stop_audio(self) -> None:
        print("Stopping audio playback.")   
        
# Implementing VideoPlayer interface
class SimpleVideoPlayer(VideoPlayer):
    def play_video(self, file_path: str) -> None:
        print(f"Playing video file: {file_path}")
        
    def stop_video(self) -> None:
        print("Stopping video playback.")
        
        
class AdvancedMediaPlayer(AudioPlayer, VideoPlayer):    
    def play_audio(self, file_path: str) -> None:
        print(f"Playing audio file: {file_path}")
        
    def stop_audio(self) -> None:
        print("Stopping audio playback.")   
    
    def play_video(self, file_path: str) -> None:
        print(f"Playing video file: {file_path}")
        
    def stop_video(self) -> None:
        print("Stopping video playback.")   
        
if __name__ == "__main__":
    audio_player = SimpleAudioPlayer()
    audio_player.play_audio("song.mp3")
    audio_player.stop_audio()
    
    video_player = SimpleVideoPlayer()
    video_player.play_video("movie.mp4")
    video_player.stop_video()
    
    advanced_player = AdvancedMediaPlayer()
    advanced_player.play_audio("podcast.mp3")
    advanced_player.stop_audio()
    advanced_player.play_video("documentary.mp4")
    advanced_player.stop_video()        
    
