package org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10495916\"]}");
	add("{\"term\":\"powder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04000366\", \"15040881\", \"15021579\"]}");
	add("{\"term\":\"powderer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10480735\"]}");
	add("{\"term\":\"powderiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04955246\"]}");
	add("{\"term\":\"powderpuff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04001232\"]}");
	add("{\"term\":\"powell\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11264877\", \"11265100\"]}");
	add("{\"term\":\"power\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"09859605\", \"11470903\", \"08194510\", \"05037846\", \"06825275\", \"10480990\", \"13968154\", \"05624029\", \"11473433\", \"05198072\"]}");
	add("{\"term\":\"powerboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03795763\"]}");
	add("{\"term\":\"powerbroker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10481783\"]}");
	add("{\"term\":\"powerfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05198072\"]}");
	add("{\"term\":\"powerhouse\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04003013\", \"08098019\", \"10481995\"]}");
	add("{\"term\":\"powerlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05211905\"]}");
	add("{\"term\":\"powhatan\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06924738\", \"09686181\", \"11265372\"]}");
	add("{\"term\":\"powwow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08339360\", \"07159124\"]}");
	add("{\"term\":\"powys\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11265580\", \"11265734\", \"11265892\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }