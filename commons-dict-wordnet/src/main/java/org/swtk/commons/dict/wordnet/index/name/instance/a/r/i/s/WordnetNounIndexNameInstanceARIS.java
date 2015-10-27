package org.swtk.commons.dict.wordnet.index.name.instance.a.r.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arisaema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11804792\"]}");
	add("{\"term\":\"arisarum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11805569\"]}");
	add("{\"term\":\"arishth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12717253\"]}");
	add("{\"term\":\"arista\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02587799\"]}");
	add("{\"term\":\"aristarchus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09229177\", \"10841471\"]}");
	add("{\"term\":\"aristocort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15103335\"]}");
	add("{\"term\":\"aristocracy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08403944\", \"08404938\"]}");
	add("{\"term\":\"aristocrat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09827177\"]}");
	add("{\"term\":\"aristolochia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11821716\"]}");
	add("{\"term\":\"aristolochiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11821507\"]}");
	add("{\"term\":\"aristolochiales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11821268\"]}");
	add("{\"term\":\"aristopak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15103335\"]}");
	add("{\"term\":\"aristophanes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10841815\"]}");
	add("{\"term\":\"aristotelean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09827503\"]}");
	add("{\"term\":\"aristotelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12213975\"]}");
	add("{\"term\":\"aristotelian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09827503\"]}");
	add("{\"term\":\"aristotelianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05978061\"]}");
	add("{\"term\":\"aristotle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10841942\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }