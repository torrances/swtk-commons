package org.swtk.commons.dict.wordnet.index.name.instance.s.t.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTEP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"step\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00534959\", \"04322323\", \"06657802\", \"06872106\", \"07398423\", \"13784719\", \"14453034\", \"04322052\", \"00286401\", \"13779389\", \"00175261\"]}");
	add("{\"term\":\"stepbrother\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10673760\"]}");
	add("{\"term\":\"stepchild\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10673900\"]}");
	add("{\"term\":\"stepdaughter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10674035\"]}");
	add("{\"term\":\"stepfather\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10674140\"]}");
	add("{\"term\":\"stephanion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05242791\"]}");
	add("{\"term\":\"stephanomeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11918229\"]}");
	add("{\"term\":\"stephanotis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13259886\"]}");
	add("{\"term\":\"stephead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06356936\"]}");
	add("{\"term\":\"stephen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11336562\"]}");
	add("{\"term\":\"stephenson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11336664\"]}");
	add("{\"term\":\"stepladder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04322737\"]}");
	add("{\"term\":\"stepmother\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10674266\"]}");
	add("{\"term\":\"stepparent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10674371\"]}");
	add("{\"term\":\"steppe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09468193\"]}");
	add("{\"term\":\"stepper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02391240\", \"04322582\", \"10204022\"]}");
	add("{\"term\":\"steprelationship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13835695\"]}");
	add("{\"term\":\"steps\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09468470\", \"04305309\"]}");
	add("{\"term\":\"stepsister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10622650\"]}");
	add("{\"term\":\"stepson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10674514\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }