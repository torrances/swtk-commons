package org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVOI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"voice\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"07044205\", \"13825132\", \"05209552\", \"10657783\", \"10778381\", \"07292402\", \"00180532\", \"07087248\", \"07414052\", \"07125323\", \"04989190\"]}");
	add("{\"term\":\"voice box\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05537362\"]}");
	add("{\"term\":\"voice communication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07123904\"]}");
	add("{\"term\":\"voice mail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06283265\"]}");
	add("{\"term\":\"voice of conscience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09207302\"]}");
	add("{\"term\":\"voice over\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07296871\"]}");
	add("{\"term\":\"voice part\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07045021\"]}");
	add("{\"term\":\"voiced sound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07135072\"]}");
	add("{\"term\":\"voiceless consonant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134605\"]}");
	add("{\"term\":\"voicelessness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05212805\", \"07145049\", \"14423911\"]}");
	add("{\"term\":\"voicemail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06283265\"]}");
	add("{\"term\":\"voiceprint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06658785\"]}");
	add("{\"term\":\"voicer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10778515\", \"10778617\"]}");
	add("{\"term\":\"voicing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01003582\"]}");
	add("{\"term\":\"void\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13933131\", \"14479148\"]}");
	add("{\"term\":\"voidance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00396605\"]}");
	add("{\"term\":\"voider\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03054849\", \"04546934\", \"10019527\", \"10234060\"]}");
	add("{\"term\":\"voiding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13494300\"]}");
	add("{\"term\":\"voile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04547080\"]}");
	add("{\"term\":\"voix celeste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04549760\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }