package com.amazon.ata.music.playlist.service.converters;

import com.amazon.ata.music.playlist.service.dynamodb.models.AlbumTrack;
import com.amazon.ata.music.playlist.service.models.PlaylistModel;
import com.amazon.ata.music.playlist.service.dynamodb.models.Playlist;
import com.amazon.ata.music.playlist.service.models.SongModel;
import org.junit.jupiter.api.Tags;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModelConverter {
    /**
     * Converts a provided {@link Playlist} into a {@link PlaylistModel} representation.
     * @param playlist the playlist to convert
     * @return the converted playlist
     */
    public PlaylistModel toPlaylistModel(Playlist playlist) {
        return PlaylistModel.builder()
            .withId(playlist.getId())
                .withName(playlist.getName())
                .withSongCount(playlist.getSongCount())
                .withTags(playlist.getTagsList())
                .withCustomerId(playlist.getCustomerId())
            .build();
    }
    public List<SongModel> toSongModel(List<AlbumTrack> albumTracks) {
        List<SongModel> songModel = new ArrayList<>();
        for (AlbumTrack albumTrack : albumTracks) {
            songModel.add(
                SongModel.builder()
                    .withAsin(albumTrack.getAsin())
                    .withTrackNumber(albumTrack.getTrackNumber())
                    .withAlbum(albumTrack.getAlbumName())
                    .withTitle(albumTrack.getSongTitle())
                    .build());
        }
        return songModel;
    }
}
