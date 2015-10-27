package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"distaff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03217127\", \"14537994\"]}");
	add("{\"term\":\"distance\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"15197470\", \"15197259\", \"07521110\", \"05136830\", \"08573923\", \"05091408\"]}");
	add("{\"term\":\"distaste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07517908\"]}");
	add("{\"term\":\"distastefulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04788240\", \"05003736\"]}");
	add("{\"term\":\"distemper\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00938717\", \"03217256\", \"03217419\", \"07567553\", \"14287544\"]}");
	add("{\"term\":\"distension\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14087115\", \"00367143\"]}");
	add("{\"term\":\"distention\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00367143\", \"14087115\"]}");
	add("{\"term\":\"distich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13765745\"]}");
	add("{\"term\":\"distillate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14861130\"]}");
	add("{\"term\":\"distillation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14861130\", \"13489509\"]}");
	add("{\"term\":\"distiller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10038378\"]}");
	add("{\"term\":\"distillery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03217532\"]}");
	add("{\"term\":\"distillment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13489509\"]}");
	add("{\"term\":\"distinction\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06719080\", \"04756794\", \"14458911\", \"05756230\"]}");
	add("{\"term\":\"distinctiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04757669\", \"04771180\"]}");
	add("{\"term\":\"distinctness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04750006\", \"14437907\", \"04710036\"]}");
	add("{\"term\":\"distomatosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14288508\"]}");
	add("{\"term\":\"distortion\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00074533\", \"00752872\", \"11532198\", \"11440253\", \"13889897\", \"07448573\"]}");
	add("{\"term\":\"distortionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10038472\"]}");
	add("{\"term\":\"distraction\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00200890\", \"00516425\", \"05714494\", \"05692245\"]}");
	add("{\"term\":\"distraint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00086649\"]}");
	add("{\"term\":\"distress\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00086649\", \"14349481\", \"14500436\", \"07511603\"]}");
	add("{\"term\":\"distressfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05044352\"]}");
	add("{\"term\":\"distressingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04727300\"]}");
	add("{\"term\":\"distributary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09290508\"]}");
	add("{\"term\":\"distributer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03217717\", \"10038586\"]}");
	add("{\"term\":\"distribution\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01114977\", \"01085001\", \"05094504\", \"05736981\"]}");
	add("{\"term\":\"distributor\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03217717\", \"08078741\", \"09804148\", \"10038586\"]}");
	add("{\"term\":\"district\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08569713\"]}");
	add("{\"term\":\"distrust\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04902968\", \"05706756\"]}");
	add("{\"term\":\"distrustfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04902968\"]}");
	add("{\"term\":\"disturbance\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"07444811\", \"14107272\", \"00334655\", \"01178825\", \"14000813\", \"14426686\", \"07443050\"]}");
	add("{\"term\":\"disturber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10038098\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }