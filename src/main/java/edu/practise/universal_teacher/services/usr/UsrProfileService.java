package edu.practise.universal_teacher.services.usr;

import edu.practise.universal_teacher.entities.UsrProfile;

import java.util.List;

public interface UsrProfileService {
    List<UsrProfile> getAllProfiles();

    UsrProfile getProfileById(Long id);

    UsrProfile saveProfile(UsrProfile usrProfile);

    void deleteProfileById(Long profileId);

    UsrProfile editProfileById(Long profileId, UsrProfile profile);


}
