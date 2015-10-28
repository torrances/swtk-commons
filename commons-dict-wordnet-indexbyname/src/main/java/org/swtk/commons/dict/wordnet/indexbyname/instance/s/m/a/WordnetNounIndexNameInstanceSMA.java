package org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"smack\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00134488\", \"00139419\", \"02840630\", \"04251975\", \"05723811\", \"07425345\"]}");
	add("{\"term\":\"smacker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00134695\", \"00139554\"]}");
	add("{\"term\":\"smacking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00134488\"]}");
	add("{\"term\":\"small\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05104343\", \"05566656\"]}");
	add("{\"term\":\"smalley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11324907\"]}");
	add("{\"term\":\"smallholder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10632903\"]}");
	add("{\"term\":\"smallholding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13270144\"]}");
	add("{\"term\":\"smallmouth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02567703\"]}");
	add("{\"term\":\"smallness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04841304\", \"05038522\", \"05117883\", \"05113933\"]}");
	add("{\"term\":\"smallpox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14147905\"]}");
	add("{\"term\":\"smaltite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15067685\"]}");
	add("{\"term\":\"smarm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06709053\"]}");
	add("{\"term\":\"smarminess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04875718\"]}");
	add("{\"term\":\"smart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14355278\"]}");
	add("{\"term\":\"smarta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10633355\"]}");
	add("{\"term\":\"smarting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14355278\"]}");
	add("{\"term\":\"smartness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04640320\", \"04820943\", \"05628738\", \"14355278\"]}");
	add("{\"term\":\"smash\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00065324\", \"00127056\", \"00570511\", \"07331969\", \"07424807\"]}");
	add("{\"term\":\"smasher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00065324\", \"10633512\", \"10633741\"]}");
	add("{\"term\":\"smashing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00377633\"]}");
	add("{\"term\":\"smattering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05814506\", \"13793294\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }