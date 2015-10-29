package org.swtk.commons.dict.wordnet.indexbyname.instance.s.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"siege\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01077041\"]}");
	add("{\"term\":\"siege of orleans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01292323\"]}");
	add("{\"term\":\"siege of syracuse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01298618\", \"01298787\"]}");
	add("{\"term\":\"siege of vicksburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01301288\"]}");
	add("{\"term\":\"siege of yorktown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01302733\"]}");
	add("{\"term\":\"siege perilous\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04223369\"]}");
	add("{\"term\":\"siegfried\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09524869\"]}");
	add("{\"term\":\"siegfried line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04223575\"]}");
	add("{\"term\":\"siemens\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11319765\", \"11319885\", \"13658719\"]}");
	add("{\"term\":\"sienna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14867663\"]}");
	add("{\"term\":\"sierra\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02629101\", \"09457249\"]}");
	add("{\"term\":\"sierra leone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09019241\"]}");
	add("{\"term\":\"sierra leone monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13707201\"]}");
	add("{\"term\":\"sierra leonean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09750567\"]}");
	add("{\"term\":\"sierra lodgepole pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11635710\"]}");
	add("{\"term\":\"sierra madre occidental\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09457373\"]}");
	add("{\"term\":\"sierra madre oriental\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09457565\"]}");
	add("{\"term\":\"sierra nevada\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09457749\", \"09457969\"]}");
	add("{\"term\":\"sierra nevada mountains\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09457749\"]}");
	add("{\"term\":\"sierra plum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12670627\"]}");
	add("{\"term\":\"sierra redwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11661945\"]}");
	add("{\"term\":\"siesta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00860309\"]}");
	add("{\"term\":\"sieur de lasalle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11138195\"]}");
	add("{\"term\":\"sieva bean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07745201\", \"12578930\"]}");
	add("{\"term\":\"sieve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04223701\"]}");
	add("{\"term\":\"sieve tube\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13119953\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }