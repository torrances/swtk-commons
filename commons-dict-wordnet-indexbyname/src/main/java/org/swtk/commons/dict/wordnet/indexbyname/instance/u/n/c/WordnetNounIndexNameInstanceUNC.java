package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unceremoniousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04919787\"]}");
	add("{\"term\":\"uncertainness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04764142\"]}");
	add("{\"term\":\"uncertainty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05706212\", \"04764142\"]}");
	add("{\"term\":\"uncertainty principle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06117686\"]}");
	add("{\"term\":\"unchangeability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04745174\"]}");
	add("{\"term\":\"unchangeableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04745174\"]}");
	add("{\"term\":\"unchangingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04745174\"]}");
	add("{\"term\":\"uncheerfulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04638655\", \"07552456\"]}");
	add("{\"term\":\"uncial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06364632\"]}");
	add("{\"term\":\"unciform bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05280907\"]}");
	add("{\"term\":\"uncle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10755916\", \"10755748\"]}");
	add("{\"term\":\"uncle joe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11338457\"]}");
	add("{\"term\":\"uncle remus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09627188\"]}");
	add("{\"term\":\"uncle sam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09627519\"]}");
	add("{\"term\":\"uncle tom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09627401\"]}");
	add("{\"term\":\"uncleanliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04903901\"]}");
	add("{\"term\":\"uncleanness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14521347\"]}");
	add("{\"term\":\"unclearness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04831097\"]}");
	add("{\"term\":\"uncloudedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04708808\"]}");
	add("{\"term\":\"uncomfortableness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07522568\", \"14470118\"]}");
	add("{\"term\":\"uncommonness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04804195\", \"04804379\"]}");
	add("{\"term\":\"uncommunicativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04659141\"]}");
	add("{\"term\":\"uncompahgre peak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09488420\"]}");
	add("{\"term\":\"unconcern\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07520777\", \"04680827\"]}");
	add("{\"term\":\"unconditioned reflex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00865191\"]}");
	add("{\"term\":\"unconfessed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08494175\"]}");
	add("{\"term\":\"uncongeniality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04666043\"]}");
	add("{\"term\":\"unconnectedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13816438\"]}");
	add("{\"term\":\"unconscientiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04680698\", \"04856305\"]}");
	add("{\"term\":\"unconscious\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05621057\"]}");
	add("{\"term\":\"unconscious mind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05621057\"]}");
	add("{\"term\":\"unconscious process\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05709685\"]}");
	add("{\"term\":\"unconsciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05686773\"]}");
	add("{\"term\":\"unconstraint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04892593\"]}");
	add("{\"term\":\"unconventionality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04808134\", \"05642755\"]}");
	add("{\"term\":\"uncouthness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04825019\"]}");
	add("{\"term\":\"uncovering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00043933\", \"00395611\"]}");
	add("{\"term\":\"uncreativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05657230\"]}");
	add("{\"term\":\"unction\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01043706\", \"03851070\", \"04875718\", \"06709053\"]}");
	add("{\"term\":\"unctuousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04875718\"]}");
	add("{\"term\":\"uncus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13892315\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }