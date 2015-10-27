package org.swtk.commons.dict.wordnet.index.name.instance.t.r.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trap\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02923753\", \"04482078\", \"05309806\", \"01249473\", \"04482157\", \"05845694\", \"04482267\", \"04481701\"]}");
	add("{\"term\":\"trapa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12368644\"]}");
	add("{\"term\":\"trapaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12368409\"]}");
	add("{\"term\":\"trapeze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04482646\"]}");
	add("{\"term\":\"trapezium\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05280390\", \"09484199\", \"13904038\"]}");
	add("{\"term\":\"trapezius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05599525\"]}");
	add("{\"term\":\"trapezohedron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13941750\"]}");
	add("{\"term\":\"trapezoid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05280572\", \"13904169\"]}");
	add("{\"term\":\"trapper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10745885\"]}");
	add("{\"term\":\"trapping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02958976\"]}");
	add("{\"term\":\"trappings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03410505\"]}");
	add("{\"term\":\"trappist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10746040\"]}");
	add("{\"term\":\"trapshooter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10746176\"]}");
	add("{\"term\":\"trapshooting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00125162\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }