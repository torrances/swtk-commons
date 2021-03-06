package org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"liabilities\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13417227\"]}");
	add("{\"term\":\"liability\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05168909\", \"14513903\", \"14554005\"]}");
	add("{\"term\":\"liability insurance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13368080\"]}");
	add("{\"term\":\"liaison\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06271913\", \"13954922\"]}");
	add("{\"term\":\"liakoura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09408479\"]}");
	add("{\"term\":\"liana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13140970\"]}");
	add("{\"term\":\"liao\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08172953\"]}");
	add("{\"term\":\"liao dynasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08172953\"]}");
	add("{\"term\":\"liaodong bandao\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09361816\"]}");
	add("{\"term\":\"liaodong peninsula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09361816\"]}");
	add("{\"term\":\"liar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10276234\"]}");
	add("{\"term\":\"liatris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12011549\"]}");
	add("{\"term\":\"liatris punctata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12012018\"]}");
	add("{\"term\":\"liatris pycnostachya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12012246\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }