package org.swtk.commons.dict.wordnet.indexbyname.instance.k.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKNI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"knickerbockers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899704\"]}");
	add("{\"term\":\"knickers\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02857998\", \"02899704\"]}");
	add("{\"term\":\"knickknack\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02900975\", \"03628657\"]}");
	add("{\"term\":\"knickknackery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02900975\"]}");
	add("{\"term\":\"knife\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13941420\", \"03629343\", \"03628765\"]}");
	add("{\"term\":\"knight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03629976\", \"10258072\"]}");
	add("{\"term\":\"knighthood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08405602\"]}");
	add("{\"term\":\"knightia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12240012\"]}");
	add("{\"term\":\"knightliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05964715\"]}");
	add("{\"term\":\"kniphofia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12458018\"]}");
	add("{\"term\":\"knish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07640366\"]}");
	add("{\"term\":\"knit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03630175\", \"03630435\", \"03630646\"]}");
	add("{\"term\":\"knitter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10259316\"]}");
	add("{\"term\":\"knitting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00911169\", \"03630175\"]}");
	add("{\"term\":\"knitwear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03631234\"]}");
	add("{\"term\":\"knitwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03630175\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }