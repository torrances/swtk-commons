package org.swtk.commons.dict.wordnet.index.name.instance.d.u.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dust\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14864262\", \"14882048\", \"14864016\"]}");
	add("{\"term\":\"dustbin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750182\"]}");
	add("{\"term\":\"dustcart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03421952\"]}");
	add("{\"term\":\"dustcloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263033\"]}");
	add("{\"term\":\"duster\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00108901\", \"03263033\", \"03263433\", \"11468490\"]}");
	add("{\"term\":\"dustiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14522317\"]}");
	add("{\"term\":\"dustman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10139987\"]}");
	add("{\"term\":\"dustmop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263608\"]}");
	add("{\"term\":\"dustpan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03263712\", \"13789182\"]}");
	add("{\"term\":\"dustpanful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13789182\"]}");
	add("{\"term\":\"dustrag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263033\"]}");
	add("{\"term\":\"dustup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07198809\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }