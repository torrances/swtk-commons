package org.swtk.commons.dict.wordnet.index.name.instance.w.o.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWORM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"worm\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04611871\", \"06598274\", \"10811668\", \"01924944\"]}");
	add("{\"term\":\"wormcast\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09504089\", \"14879663\"]}");
	add("{\"term\":\"wormhole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09504166\"]}");
	add("{\"term\":\"wormseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11849273\"]}");
	add("{\"term\":\"wormwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11949018\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }