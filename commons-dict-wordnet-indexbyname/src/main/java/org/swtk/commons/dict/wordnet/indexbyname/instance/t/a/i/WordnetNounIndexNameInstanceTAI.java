package org.swtk.commons.dict.wordnet.indexbyname.instance.t.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tai\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06947166\", \"09753726\"]}");
	add("{\"term\":\"taichi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00828450\"]}");
	add("{\"term\":\"taichichuan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00828450\"]}");
	add("{\"term\":\"taichung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08748890\"]}");
	add("{\"term\":\"taif\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09017490\"]}");
	add("{\"term\":\"tail\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04323784\", \"04391103\", \"04391286\", \"10708600\", \"05566889\", \"13941307\", \"15293196\", \"02160209\"]}");
	add("{\"term\":\"tailback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00728435\", \"10708802\"]}");
	add("{\"term\":\"tailboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04391680\"]}");
	add("{\"term\":\"tailcoat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03243757\"]}");
	add("{\"term\":\"tailfin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04391493\", \"04537257\"]}");
	add("{\"term\":\"tailflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11804389\"]}");
	add("{\"term\":\"tailgate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04391680\"]}");
	add("{\"term\":\"tailgater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10708925\"]}");
	add("{\"term\":\"tailing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00321312\"]}");
	add("{\"term\":\"taillight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04391997\"]}");
	add("{\"term\":\"tailor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10709060\"]}");
	add("{\"term\":\"tailorbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01568848\"]}");
	add("{\"term\":\"tailoring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00619676\"]}");
	add("{\"term\":\"tailpiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04392518\"]}");
	add("{\"term\":\"tailpipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04392623\"]}");
	add("{\"term\":\"tailplane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03541302\"]}");
	add("{\"term\":\"tailrace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04392756\"]}");
	add("{\"term\":\"tails\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03243757\"]}");
	add("{\"term\":\"tailspin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00307036\", \"14427446\"]}");
	add("{\"term\":\"tailstock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04393138\"]}");
	add("{\"term\":\"tailwind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11463505\"]}");
	add("{\"term\":\"tailwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12837268\"]}");
	add("{\"term\":\"taint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14511315\"]}");
	add("{\"term\":\"taipan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01754113\"]}");
	add("{\"term\":\"taipeh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08748728\"]}");
	add("{\"term\":\"taipei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08748728\"]}");
	add("{\"term\":\"taira\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02454046\"]}");
	add("{\"term\":\"taiwan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08748187\", \"08748383\"]}");
	add("{\"term\":\"taiwanese\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06943410\", \"09753331\"]}");
	add("{\"term\":\"taiyuan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08746428\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }