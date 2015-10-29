package org.swtk.commons.dict.wordnet.indexbyname.instance.s.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sudafed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03812592\"]}");
	add("{\"term\":\"sudan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09051612\", \"09051827\"]}");
	add("{\"term\":\"sudanese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09751584\"]}");
	add("{\"term\":\"sudanese monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13717412\"]}");
	add("{\"term\":\"sudanese pound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13717525\"]}");
	add("{\"term\":\"sudation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13556464\"]}");
	add("{\"term\":\"sudatorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04357313\"]}");
	add("{\"term\":\"sudatory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04357313\", \"04357425\"]}");
	add("{\"term\":\"sudbury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08847143\"]}");
	add("{\"term\":\"sudden death\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15259384\"]}");
	add("{\"term\":\"sudden infant death syndrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14333719\"]}");
	add("{\"term\":\"suddenness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05067645\"]}");
	add("{\"term\":\"sudoku\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06798869\"]}");
	add("{\"term\":\"sudor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05413094\"]}");
	add("{\"term\":\"sudoriferous gland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05338207\"]}");
	add("{\"term\":\"sudorific\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04357425\"]}");
	add("{\"term\":\"sudra\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08324370\", \"10613692\"]}");
	add("{\"term\":\"suds\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07903167\", \"09462117\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }