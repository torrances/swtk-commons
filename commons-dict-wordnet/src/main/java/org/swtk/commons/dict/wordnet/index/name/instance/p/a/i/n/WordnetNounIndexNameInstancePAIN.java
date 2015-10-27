package org.swtk.commons.dict.wordnet.index.name.instance.p.a.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pain\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05838383\", \"10411212\", \"05732639\", \"07509503\", \"14346126\"]}");
	add("{\"term\":\"paine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11240826\", \"11241097\"]}");
	add("{\"term\":\"painfulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04727300\", \"07509503\"]}");
	add("{\"term\":\"painkiller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02710542\"]}");
	add("{\"term\":\"pains\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00790427\"]}");
	add("{\"term\":\"painstakingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04679712\"]}");
	add("{\"term\":\"paint\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04119846\", \"08608465\", \"03880896\"]}");
	add("{\"term\":\"paintball\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00468190\", \"03881484\"]}");
	add("{\"term\":\"paintbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03881789\"]}");
	add("{\"term\":\"paintbrush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03881909\"]}");
	add("{\"term\":\"painter\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02127963\", \"03882030\", \"10413608\", \"10411352\"]}");
	add("{\"term\":\"painting\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00610504\", \"00718460\", \"00938436\", \"03882197\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }