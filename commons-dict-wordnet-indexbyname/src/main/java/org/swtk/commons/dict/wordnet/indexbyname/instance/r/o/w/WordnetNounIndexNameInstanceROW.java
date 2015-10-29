package org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"row\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00446336\", \"05052831\", \"08450457\", \"03124680\", \"09440243\", \"07198809\", \"08448447\"]}");
	add("{\"term\":\"row house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04122350\"]}");
	add("{\"term\":\"row of bricks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04122764\"]}");
	add("{\"term\":\"rowan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12679069\"]}");
	add("{\"term\":\"rowan tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12679069\"]}");
	add("{\"term\":\"rowanberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12679242\"]}");
	add("{\"term\":\"rowboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03204585\"]}");
	add("{\"term\":\"rowdiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14000631\"]}");
	add("{\"term\":\"rowdy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09898763\"]}");
	add("{\"term\":\"rowdyism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14000631\"]}");
	add("{\"term\":\"rowel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04122238\"]}");
	add("{\"term\":\"rower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10388619\"]}");
	add("{\"term\":\"rowing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00446336\"]}");
	add("{\"term\":\"rowing boat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04122550\"]}");
	add("{\"term\":\"rowing club\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08247140\"]}");
	add("{\"term\":\"rowlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03911849\"]}");
	add("{\"term\":\"rowlock arch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04122636\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }