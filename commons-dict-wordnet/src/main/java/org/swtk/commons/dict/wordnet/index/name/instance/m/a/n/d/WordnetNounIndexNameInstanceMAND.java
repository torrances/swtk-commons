package org.swtk.commons.dict.wordnet.index.name.instance.m.a.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"manda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06993847\"]}");
	add("{\"term\":\"mandaean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07001468\", \"10309884\"]}");
	add("{\"term\":\"mandaeanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06233131\"]}");
	add("{\"term\":\"mandala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03722195\"]}");
	add("{\"term\":\"mandalay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08733785\"]}");
	add("{\"term\":\"mandamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06566666\"]}");
	add("{\"term\":\"mandara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06996761\"]}");
	add("{\"term\":\"mandarin\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06942870\", \"07763927\", \"10309332\", \"10309427\", \"10309524\", \"12730661\"]}");
	add("{\"term\":\"mandatary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10309630\"]}");
	add("{\"term\":\"mandate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01142979\", \"08615283\", \"06568472\"]}");
	add("{\"term\":\"mandator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10309760\"]}");
	add("{\"term\":\"mandatory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08615283\", \"10309630\"]}");
	add("{\"term\":\"mande\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07009672\"]}");
	add("{\"term\":\"mandean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07001468\", \"10309884\"]}");
	add("{\"term\":\"mandeanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06233131\"]}");
	add("{\"term\":\"mandela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11173190\"]}");
	add("{\"term\":\"mandelamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03760669\"]}");
	add("{\"term\":\"mandelbrot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11173446\"]}");
	add("{\"term\":\"mandelshtam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11173605\"]}");
	add("{\"term\":\"mandelstam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11173605\"]}");
	add("{\"term\":\"mandevilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11793607\"]}");
	add("{\"term\":\"mandible\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05283404\"]}");
	add("{\"term\":\"mandibula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05283404\"]}");
	add("{\"term\":\"mandioc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12947449\"]}");
	add("{\"term\":\"mandioca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12947449\"]}");
	add("{\"term\":\"mandola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03722426\"]}");
	add("{\"term\":\"mandolin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03722505\"]}");
	add("{\"term\":\"mandragora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12927094\"]}");
	add("{\"term\":\"mandrake\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12927258\", \"12927531\"]}");
	add("{\"term\":\"mandrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04284631\"]}");
	add("{\"term\":\"mandril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04284631\"]}");
	add("{\"term\":\"mandrill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02489539\"]}");
	add("{\"term\":\"mandrillus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02489418\"]}");
	add("{\"term\":\"manduca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02301485\"]}");
	add("{\"term\":\"manduction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00279654\", \"01038365\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }