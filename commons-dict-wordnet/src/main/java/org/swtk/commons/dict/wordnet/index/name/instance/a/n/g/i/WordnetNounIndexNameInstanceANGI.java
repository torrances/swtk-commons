package org.swtk.commons.dict.wordnet.index.name.instance.a.n.g.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANGI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"angiitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14281678\"]}");
	add("{\"term\":\"angina\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14131521\", \"14197107\"]}");
	add("{\"term\":\"angiocardiogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02714096\"]}");
	add("{\"term\":\"angiocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11686099\"]}");
	add("{\"term\":\"angioedema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14143792\"]}");
	add("{\"term\":\"angiogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13453165\"]}");
	add("{\"term\":\"angiogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02714432\"]}");
	add("{\"term\":\"angiography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00907034\"]}");
	add("{\"term\":\"angiohemophilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14194658\"]}");
	add("{\"term\":\"angiologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09813271\"]}");
	add("{\"term\":\"angiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06056059\"]}");
	add("{\"term\":\"angioma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14259410\"]}");
	add("{\"term\":\"angiopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14094901\"]}");
	add("{\"term\":\"angioplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00667711\"]}");
	add("{\"term\":\"angiopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13236484\"]}");
	add("{\"term\":\"angiosarcoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14263744\"]}");
	add("{\"term\":\"angioscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02714639\"]}");
	add("{\"term\":\"angiosperm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11685823\"]}");
	add("{\"term\":\"angiospermae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11685380\"]}");
	add("{\"term\":\"angiotelectasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14037992\"]}");
	add("{\"term\":\"angiotensin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02714749\"]}");
	add("{\"term\":\"angiotonin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02714749\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }