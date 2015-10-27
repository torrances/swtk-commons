package org.swtk.commons.dict.wordnet.index.name.instance.r.a.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRATE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rate\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13838861\", \"05065731\", \"13346032\", \"15311467\"]}");
	add("{\"term\":\"rateability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14554261\"]}");
	add("{\"term\":\"rateables\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13265975\"]}");
	add("{\"term\":\"ratel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02450949\"]}");
	add("{\"term\":\"ratepayer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10527734\"]}");
	add("{\"term\":\"rates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13335958\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }