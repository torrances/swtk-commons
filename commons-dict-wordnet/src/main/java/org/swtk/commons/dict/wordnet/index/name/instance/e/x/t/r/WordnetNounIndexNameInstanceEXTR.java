package org.swtk.commons.dict.wordnet.index.name.instance.e.x.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"extra\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03312926\", \"06609702\", \"10696008\"]}");
	add("{\"term\":\"extract\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06412153\", \"14872955\"]}");
	add("{\"term\":\"extraction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00393758\", \"04930920\", \"13499728\"]}");
	add("{\"term\":\"extractor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02976173\", \"02999605\", \"03313097\"]}");
	add("{\"term\":\"extradition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00214349\"]}");
	add("{\"term\":\"extrados\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13891684\"]}");
	add("{\"term\":\"extraneousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13818797\"]}");
	add("{\"term\":\"extraordinariness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04803739\"]}");
	add("{\"term\":\"extrapolation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05789142\", \"05810555\"]}");
	add("{\"term\":\"extrasystole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07416204\"]}");
	add("{\"term\":\"extraterrestrial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09507595\"]}");
	add("{\"term\":\"extravagance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00744939\", \"04902002\", \"05126162\"]}");
	add("{\"term\":\"extravagancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05126162\"]}");
	add("{\"term\":\"extravaganza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00516695\"]}");
	add("{\"term\":\"extravasation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13500016\", \"14032052\", \"14882945\"]}");
	add("{\"term\":\"extraversion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04629095\"]}");
	add("{\"term\":\"extravert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10094629\"]}");
	add("{\"term\":\"extreme\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08586694\", \"05105361\"]}");
	add("{\"term\":\"extremeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05105487\"]}");
	add("{\"term\":\"extremism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06227743\"]}");
	add("{\"term\":\"extremist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10094523\"]}");
	add("{\"term\":\"extremity\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05574552\", \"08586507\", \"13965457\", \"14500105\", \"05567541\"]}");
	add("{\"term\":\"extremum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13675520\", \"08586694\"]}");
	add("{\"term\":\"extrication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01247140\"]}");
	add("{\"term\":\"extropy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06761981\"]}");
	add("{\"term\":\"extroversion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04629095\"]}");
	add("{\"term\":\"extrovert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10094629\"]}");
	add("{\"term\":\"extrusion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00359528\", \"13917127\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }