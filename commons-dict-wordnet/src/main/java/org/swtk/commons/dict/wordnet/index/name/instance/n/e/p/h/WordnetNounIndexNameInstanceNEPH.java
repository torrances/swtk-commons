package org.swtk.commons.dict.wordnet.index.name.instance.n.e.p.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEPH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nepheline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14707365\"]}");
	add("{\"term\":\"nephelinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14707608\"]}");
	add("{\"term\":\"nephelite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14707365\"]}");
	add("{\"term\":\"nephelium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12765920\"]}");
	add("{\"term\":\"nephew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10373054\"]}");
	add("{\"term\":\"nephology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06129215\"]}");
	add("{\"term\":\"nephoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03824587\"]}");
	add("{\"term\":\"nephralgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14352564\"]}");
	add("{\"term\":\"nephrectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00687638\"]}");
	add("{\"term\":\"nephrite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14707756\"]}");
	add("{\"term\":\"nephritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14137280\"]}");
	add("{\"term\":\"nephroangiosclerosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14137420\"]}");
	add("{\"term\":\"nephroblastoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14269579\"]}");
	add("{\"term\":\"nephrocalcinosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14138936\"]}");
	add("{\"term\":\"nephrolepis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13225544\"]}");
	add("{\"term\":\"nephrolith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09348730\"]}");
	add("{\"term\":\"nephrolithiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14139130\"]}");
	add("{\"term\":\"nephrology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06062052\"]}");
	add("{\"term\":\"nephron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05254521\"]}");
	add("{\"term\":\"nephropathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14136710\"]}");
	add("{\"term\":\"nephrops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01986772\"]}");
	add("{\"term\":\"nephropsidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01986599\"]}");
	add("{\"term\":\"nephroptosia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14582491\"]}");
	add("{\"term\":\"nephroptosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14582491\"]}");
	add("{\"term\":\"nephrosclerosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14137420\"]}");
	add("{\"term\":\"nephrosis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14136710\", \"14331151\"]}");
	add("{\"term\":\"nephrotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00699487\"]}");
	add("{\"term\":\"nephrotoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15060778\"]}");
	add("{\"term\":\"nephthys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09535827\"]}");
	add("{\"term\":\"nephthytis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11810431\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }