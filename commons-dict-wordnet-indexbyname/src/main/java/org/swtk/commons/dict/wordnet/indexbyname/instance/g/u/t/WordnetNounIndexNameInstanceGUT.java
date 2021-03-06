package org.swtk.commons.dict.wordnet.indexbyname.instance.g.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gut\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02987196\", \"09323389\", \"05541966\"]}");
	add("{\"term\":\"gut issue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05823078\"]}");
	add("{\"term\":\"gutenberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11040509\"]}");
	add("{\"term\":\"guthrie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11040717\"]}");
	add("{\"term\":\"gutierrezia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11994357\"]}");
	add("{\"term\":\"gutierrezia microcephala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11994842\"]}");
	add("{\"term\":\"gutierrezia sarothrae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11995026\"]}");
	add("{\"term\":\"gutierrezia texana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11995357\"]}");
	add("{\"term\":\"gutlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04868550\"]}");
	add("{\"term\":\"guts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05039506\"]}");
	add("{\"term\":\"gutsiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04867047\"]}");
	add("{\"term\":\"gutta balata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12795256\"]}");
	add("{\"term\":\"gutter\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03476808\", \"10172529\", \"14499576\", \"03476596\"]}");
	add("{\"term\":\"gutter press\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06273673\"]}");
	add("{\"term\":\"guttersnipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10682391\"]}");
	add("{\"term\":\"guttiferae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12384505\"]}");
	add("{\"term\":\"guttiferales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12380095\"]}");
	add("{\"term\":\"guttural\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134884\"]}");
	add("{\"term\":\"guttural consonant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134884\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }