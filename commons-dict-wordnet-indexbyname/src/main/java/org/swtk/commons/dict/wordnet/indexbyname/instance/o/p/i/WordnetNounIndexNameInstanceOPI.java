package org.swtk.commons.dict.wordnet.indexbyname.instance.o.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"opiate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03856266\"]}");
	add("{\"term\":\"opiliones\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01772276\"]}");
	add("{\"term\":\"opinion\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05925333\", \"01193648\", \"06563775\", \"05958593\", \"06794876\", \"05954491\"]}");
	add("{\"term\":\"opinion poll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05809006\"]}");
	add("{\"term\":\"opisthobranchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01952836\"]}");
	add("{\"term\":\"opisthocomidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01812087\"]}");
	add("{\"term\":\"opisthocomus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01812233\"]}");
	add("{\"term\":\"opisthocomus hoazin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01812393\"]}");
	add("{\"term\":\"opisthognathidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02614055\"]}");
	add("{\"term\":\"opisthorchiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14477777\"]}");
	add("{\"term\":\"opisthotonos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14384918\"]}");
	add("{\"term\":\"opium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03856486\"]}");
	add("{\"term\":\"opium addict\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10398977\"]}");
	add("{\"term\":\"opium den\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03856644\"]}");
	add("{\"term\":\"opium poppy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11922858\"]}");
	add("{\"term\":\"opium taker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10398977\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }