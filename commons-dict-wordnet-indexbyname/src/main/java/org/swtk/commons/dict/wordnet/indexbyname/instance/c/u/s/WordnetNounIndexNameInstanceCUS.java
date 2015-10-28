package org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCUS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cusco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09002110\"]}");
	add("{\"term\":\"cuscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01884205\"]}");
	add("{\"term\":\"cuscuta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12846061\"]}");
	add("{\"term\":\"cushat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01815729\"]}");
	add("{\"term\":\"cushaw\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07733940\", \"12182698\"]}");
	add("{\"term\":\"cushing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10938586\"]}");
	add("{\"term\":\"cushion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03156166\", \"03156466\", \"04205840\"]}");
	add("{\"term\":\"cushioning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03878742\"]}");
	add("{\"term\":\"cushitic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07003496\"]}");
	add("{\"term\":\"cusk\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02526058\", \"02528013\", \"07794786\"]}");
	add("{\"term\":\"cusp\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05315020\", \"05396968\", \"03156582\"]}");
	add("{\"term\":\"cuspid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05314590\"]}");
	add("{\"term\":\"cuspidation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03156728\"]}");
	add("{\"term\":\"cuspidor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04288398\"]}");
	add("{\"term\":\"cuss\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07139804\", \"09927483\", \"10439375\"]}");
	add("{\"term\":\"cussedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04916447\"]}");
	add("{\"term\":\"custard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07634613\"]}");
	add("{\"term\":\"custer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10938813\"]}");
	add("{\"term\":\"custodian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10003828\"]}");
	add("{\"term\":\"custodianship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00592737\"]}");
	add("{\"term\":\"custody\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00820339\", \"01149860\", \"14023148\"]}");
	add("{\"term\":\"custom\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01098778\", \"13338024\", \"05675248\", \"00414252\"]}");
	add("{\"term\":\"customer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10004189\"]}");
	add("{\"term\":\"customhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03156969\"]}");
	add("{\"term\":\"customs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13338024\"]}");
	add("{\"term\":\"customshouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03156969\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }