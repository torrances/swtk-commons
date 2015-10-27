package org.swtk.commons.dict.wordnet.index.name.instance.c.r.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCREA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"creak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07396464\"]}");
	add("{\"term\":\"creaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07396464\"]}");
	add("{\"term\":\"cream\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03133170\", \"07863174\", \"08403766\"]}");
	add("{\"term\":\"creamcups\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11927874\"]}");
	add("{\"term\":\"creamer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03133652\"]}");
	add("{\"term\":\"creamery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03133519\"]}");
	add("{\"term\":\"creaminess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943867\"]}");
	add("{\"term\":\"crease\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03634019\", \"13928798\", \"13930429\"]}");
	add("{\"term\":\"creashak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12251875\"]}");
	add("{\"term\":\"creatin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14849413\"]}");
	add("{\"term\":\"creatine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14849413\"]}");
	add("{\"term\":\"creation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"09489410\", \"00238736\", \"00241051\", \"07343542\", \"03133774\", \"00910190\"]}");
	add("{\"term\":\"creationism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05968445\"]}");
	add("{\"term\":\"creativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05632483\"]}");
	add("{\"term\":\"creativity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05632483\"]}");
	add("{\"term\":\"creator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09637345\", \"09559474\"]}");
	add("{\"term\":\"creature\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09996081\", \"09995959\", \"00015568\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }