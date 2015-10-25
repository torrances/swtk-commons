package org.swtk.commons.dict.wiktionary.generated.d.o.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDOZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dozen", "{\"term\":\"dozen\", \"etymology\":{\"influencers\":[{},{},{},{},{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027dozaine\u0027 (a group of twelve) (French \u0027douzaine\u0027 , from \u0027doze\u0027 (twelve) + \u0027-aine\u0027 (-ish) from Latin \u0027duodecim\u0027 (twelve) (from \u0027duo\u0027 (two) + \u0027decem\u0027 (ten) + \u0027-ana\u0027 (-ish)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A set of twelve\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Can I have a \u0027\u0027dozen\u0027\u0027 eggs, please\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I ordered two \u0027\u0027dozen\u0027\u0027 doughnuts\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"There shouldn\u0027t be more than two \u0027\u0027dozen\u0027\u0027 Christmas cards left to write\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Pack the shirts in \u0027\u0027dozens\u0027\u0027, please\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A large, unspecified number of, comfortably estimated in small multiples of twelve, thus generally implied to be significantly more than ten or twelve, but less than perhaps one or two hundred; many\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"There must have been \u0027\u0027dozens\u0027\u0027 of examples just on the first page\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"There were \u0027\u0027dozens\u0027\u0027 and \u0027\u0027dozens\u0027\u0027 of applicants before the job was posted\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dAlthough there are \u0027\u0027dozens\u0027\u0027 of different types of gems, among the best known and most important are diamond, ruby and sapphire, emerald and other gem forms of the mineral beryl, chrysoberyl, tanzanite, tsavorite, topaz and jade\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"An old English measure of ore containing 12 hundredweight\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"1957\u0027\u0027, H.R. Schubert, \u0027History of the British Iron and Steel Industry\u0027, p. 13\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027dozen\u0027\u0027 as a measure for iron ore remained almost completely constant at 12 cwts. during the sixteenth and seventeenth centuries\", \"priority\":12}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }