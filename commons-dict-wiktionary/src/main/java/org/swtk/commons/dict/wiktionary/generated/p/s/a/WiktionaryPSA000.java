package org.swtk.commons.dict.wiktionary.generated.p.s.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPSA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("psalm", "{\"term\":\"psalm\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Middle english (1100-1500) \u0027salm\u0027 or \u0027psalme\u0027 from Old english (ca. 450-1100) \u0027psealm\u0027 later reinforced from Old french (842-ca. 1400) \u0027psalme\u0027 (modern French \u0027psaume\u0027 , both from Latin \u0027psalmus\u0027 from Ancient greek (to 1453) \u0027ψαλμός\u0027 (the sound emenating from twitching or twanging perhaps with the hands or fingers, mostly of musical strings) (from \u0027ψάλλω\u0027 (to make a sound by striking, touching, plucking, rubbing, twanging, or vibrating) , but later in New Testament times the meaning of \u0027ψαλμός\u0027 evolved from its Classical meaning of \u0026quot;a tune played to the harp\u0026quot; to a more general tune that could be played with any instrument; even a song sung with or without their accompaniment. By the Byzantine Period, it lost all of its instrumental characteristics.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sacred song; a poetical composition for use in the praise or worship of God\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Especially, one of the hymns by David and others, collected into one book of the Old Testament, or a modern metrical version of such a hymn for public worship\", \"priority\":2}]}, \"synonyms\":{}}");

	add("psalms", "{\"term\":\"psalms\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A book of the Old Testament of the Bible, and of the Tanakh\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }