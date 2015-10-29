package org.swtk.commons.dict.wordnet.indexbyname.instance.s.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSNE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"snead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11326755\"]}");
	add("{\"term\":\"sneak\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10110781\", \"10506264\", \"10635564\"]}");
	add("{\"term\":\"sneak preview\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06901898\"]}");
	add("{\"term\":\"sneak thief\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10635720\"]}");
	add("{\"term\":\"sneaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10110781\", \"03477658\"]}");
	add("{\"term\":\"sneakiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04664988\"]}");
	add("{\"term\":\"sneer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06729614\", \"06729422\"]}");
	add("{\"term\":\"sneerer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10635895\"]}");
	add("{\"term\":\"sneeze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14338277\"]}");
	add("{\"term\":\"sneezer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10636094\"]}");
	add("{\"term\":\"sneezeweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11997772\"]}");
	add("{\"term\":\"sneezeweed yarrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11937434\"]}");
	add("{\"term\":\"sneezewort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11937434\"]}");
	add("{\"term\":\"sneezing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14338277\"]}");
	add("{\"term\":\"snellen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11326915\"]}");
	add("{\"term\":\"snellen chart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04256815\"]}");
	add("{\"term\":\"snellen test\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05755001\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }