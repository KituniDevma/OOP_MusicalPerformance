# OOP_MusicalPerformance
This is implemented using OOP concepts (Java language) . This is regarding a musical performance.

Each performance has the attributes main artist, performance name, year, venue, track list, backup singers, and backup dancers. The track list consists of a variable number of music tracks.
The venue and year attributes can be viewed by anyone, but they can not be changed.
Performance name is both viewable and changeable.
Anyone can make changes to the track list, but the currently existing track list should not be visible to outsiders.
Each music track has a name and a duration.
The number of backup singers and backup dancers varies for each performance.
There are two types of performances: live performances and studio performances.
During live performances, the artist can interact with the audience.
Only studio performances have the function of audio processing.
Both live and studio performances can be recorded, but the recording methods are different for the two types.
Main artist, backup singers, and backup dancers are all considered as artists. All artists have a name.
Both main artist and backup singers are considered as singers. All singers can sing.
Backup dancers can dance.
Both backup singers and backup dancers can back up the main artist during the performance, but the way they do it is different. Backup singers back up the artist by singing while backup dancers back up the artist by dancing.
(Hint: Use a interface called IBackup)
When a performance is initiated, the following things happen.
A message “Welcome to the Performance [name of the performance] by [name of the main artist]!” is printed on the screen.
The main artist sings. Backup singers and backup dancers back him/her up.
