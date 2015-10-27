package org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"preteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09650451\"]}");
	add("{\"term\":\"preteenager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09650451\"]}");
	add("{\"term\":\"pretence\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00756299\", \"05777927\", \"06772060\", \"04686265\", \"04796081\"]}");
	add("{\"term\":\"pretend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00756843\"]}");
	add("{\"term\":\"pretender\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10215212\", \"10221154\", \"10489564\"]}");
	add("{\"term\":\"pretending\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00756299\"]}");
	add("{\"term\":\"pretense\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04686265\", \"04796081\", \"05777927\", \"06772060\", \"00756299\"]}");
	add("{\"term\":\"pretension\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04796210\", \"06743120\", \"04796081\"]}");
	add("{\"term\":\"pretentiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04796210\", \"04825154\"]}");
	add("{\"term\":\"preterist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10489717\"]}");
	add("{\"term\":\"preterit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13828826\"]}");
	add("{\"term\":\"preterite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13828826\"]}");
	add("{\"term\":\"preterition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07119399\"]}");
	add("{\"term\":\"pretermission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05715093\"]}");
	add("{\"term\":\"pretext\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04686265\", \"06772487\"]}");
	add("{\"term\":\"pretor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10482594\"]}");
	add("{\"term\":\"pretoria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09022642\"]}");
	add("{\"term\":\"pretorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04004233\"]}");
	add("{\"term\":\"pretrial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07159734\"]}");
	add("{\"term\":\"prettiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04692998\"]}");
	add("{\"term\":\"pretzel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07711487\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }