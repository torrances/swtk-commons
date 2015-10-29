package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lola montez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11207461\"]}");
	add("{\"term\":\"loligo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01974261\"]}");
	add("{\"term\":\"lolita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10290080\"]}");
	add("{\"term\":\"lolium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12145022\"]}");
	add("{\"term\":\"lolium multiflorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12145518\"]}");
	add("{\"term\":\"lolium perenne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12145335\"]}");
	add("{\"term\":\"lolium temulentum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12145700\"]}");
	add("{\"term\":\"lollipop\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07623214\", \"07631383\"]}");
	add("{\"term\":\"lollipop lady\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10290165\"]}");
	add("{\"term\":\"lollipop woman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10290165\"]}");
	add("{\"term\":\"lolly\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07631383\", \"13406389\"]}");
	add("{\"term\":\"lolo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06945725\"]}");
	add("{\"term\":\"loloish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06945314\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }