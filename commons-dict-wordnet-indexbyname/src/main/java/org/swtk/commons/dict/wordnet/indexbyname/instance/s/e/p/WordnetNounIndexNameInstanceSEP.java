package org.swtk.commons.dict.wordnet.indexbyname.instance.s.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sep\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15237535\"]}");
	add("{\"term\":\"sepal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11711081\"]}");
	add("{\"term\":\"separability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14441397\"]}");
	add("{\"term\":\"separate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04179965\", \"06280438\"]}");
	add("{\"term\":\"separateness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04750006\", \"14024698\", \"14437907\"]}");
	add("{\"term\":\"separation\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00384414\", \"01203919\", \"07310009\", \"08664696\", \"01203511\", \"01256840\", \"05097154\", \"07346000\", \"14437698\"]}");
	add("{\"term\":\"separationism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01205155\"]}");
	add("{\"term\":\"separationist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599482\"]}");
	add("{\"term\":\"separatism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01205155\", \"04950881\", \"08397071\"]}");
	add("{\"term\":\"separatist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599482\"]}");
	add("{\"term\":\"separator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02999605\"]}");
	add("{\"term\":\"separatrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06857953\"]}");
	add("{\"term\":\"sephardi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599756\"]}");
	add("{\"term\":\"sepia\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01975052\", \"15046494\", \"04980653\"]}");
	add("{\"term\":\"sepiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01974924\"]}");
	add("{\"term\":\"sepiolite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14705606\"]}");
	add("{\"term\":\"seppuku\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00224229\"]}");
	add("{\"term\":\"sepsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14204330\"]}");
	add("{\"term\":\"sept\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07987168\", \"15237535\"]}");
	add("{\"term\":\"septation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00399393\"]}");
	add("{\"term\":\"septectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00688725\"]}");
	add("{\"term\":\"september\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15237535\"]}");
	add("{\"term\":\"septenary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13767056\"]}");
	add("{\"term\":\"septet\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07055769\", \"08004236\", \"08004932\", \"08264856\", \"13767056\"]}");
	add("{\"term\":\"septette\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07055769\", \"08004236\", \"08004932\", \"08264856\"]}");
	add("{\"term\":\"septicaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14213319\"]}");
	add("{\"term\":\"septicemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14213319\"]}");
	add("{\"term\":\"septillion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13775725\"]}");
	add("{\"term\":\"septobasidiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13090108\"]}");
	add("{\"term\":\"septobasidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13090295\"]}");
	add("{\"term\":\"septuagenarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599889\"]}");
	add("{\"term\":\"septuagesima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15217107\"]}");
	add("{\"term\":\"septuagint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06460067\"]}");
	add("{\"term\":\"septum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11703912\", \"05230233\"]}");
	add("{\"term\":\"sepulcher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02925268\"]}");
	add("{\"term\":\"sepulchre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02925268\"]}");
	add("{\"term\":\"sepulture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02925268\", \"07466297\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }