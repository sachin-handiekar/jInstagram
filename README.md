#jMusixMatch

A Java wrapper for the [MusixMatch API](https://developer.musixmatch.com/)

###How to use ?

* Declaring the MusixMatch Instance

		String apiKey = "Your MusixMatch API Key";
		MusixMatch musixMatch = new MusixMatch(apiKey);


* Fuzzy Search

		String trackName = "Don't stop the Party";
		String artistName = "The Black Eyed Peas";

		// Track Search [ Fuzzy ]
		Track track = musixMatch.getMatchingTrack(trackName, artistName);

		TrackData data = track.getTrack();

		System.out.println("AlbumID : "    + data.getAlbumId());
		System.out.println("Album Name : " + data.getAlbumName());
		System.out.println("Artist ID : "  + data.getArtistId());
		System.out.println("Album Name : " + data.getArtistName());
		System.out.println("Track ID : "   + data.getTrackId());


* Getting Lyrics

		int trackID = data.getTrackId();

		Lyrics lyrics = musixMatch.getLyrics(trackID);

		System.out.println("Lyrics ID       : "     + lyrics.getLyricsId());
		System.out.println("Lyrics Language : "     + lyrics.getLyricsLang());
		System.out.println("Lyrics Body     : "     + lyrics.getLyricsBody());
		System.out.println("Script-Tracking-URL : " + lyrics.getScriptTrackingURL());
		System.out.println("Pixel-Tracking-URL : "  + lyrics.getPixelTrackingURL());
		System.out.println("Lyrics Copyright : "    + lyrics.getLyricsCopyright());


* Search Tracks
 		
 		// The following will search for tracks with matching artist_name 'Eminem'
 		List<Track> tracks = musixMatch.searchTracks("", "Eminem", "", 10, 10, true);

		for (Track trk : tracks) {
			TrackData trkData = trk.getTrack();

			System.out.println("AlbumID : "    + trkData.getAlbumId());
			System.out.println("Album Name : " + trkData.getAlbumName());
			System.out.println("Artist ID : "  + trkData.getArtistId());
			System.out.println("Album Name : " + trkData.getArtistName());
			System.out.println("Track ID : "   + trkData.getTrackId());
			System.out.println();
		}


###Dependencies

* Google GSON (http://code.google.com/p/google-gson/)