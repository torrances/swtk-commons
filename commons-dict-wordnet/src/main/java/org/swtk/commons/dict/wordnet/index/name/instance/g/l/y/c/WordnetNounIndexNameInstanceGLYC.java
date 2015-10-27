package org.swtk.commons.dict.wordnet.index.name.instance.g.l.y.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLYC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glyceraldehyde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14908971\"]}");
	add("{\"term\":\"glyceria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12142641\"]}");
	add("{\"term\":\"glyceride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909239\"]}");
	add("{\"term\":\"glycerin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909835\"]}");
	add("{\"term\":\"glycerine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909835\"]}");
	add("{\"term\":\"glycerite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910331\"]}");
	add("{\"term\":\"glycerogel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910448\"]}");
	add("{\"term\":\"glycerogelatin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910448\"]}");
	add("{\"term\":\"glycerol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909835\"]}");
	add("{\"term\":\"glycerole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910331\"]}");
	add("{\"term\":\"glyceryl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910594\"]}");
	add("{\"term\":\"glycine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12552513\", \"14631171\"]}");
	add("{\"term\":\"glycogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14819919\"]}");
	add("{\"term\":\"glycogenesis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07430562\", \"13509701\"]}");
	add("{\"term\":\"glycol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14860150\", \"14876037\"]}");
	add("{\"term\":\"glycolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13509809\"]}");
	add("{\"term\":\"glycoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14912461\"]}");
	add("{\"term\":\"glycoside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14911456\"]}");
	add("{\"term\":\"glycosuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14291343\"]}");
	add("{\"term\":\"glycyrrhiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12553225\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }