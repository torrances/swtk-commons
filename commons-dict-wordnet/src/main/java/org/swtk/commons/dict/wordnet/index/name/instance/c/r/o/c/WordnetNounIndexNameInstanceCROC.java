package org.swtk.commons.dict.wordnet.index.name.instance.c.r.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCROC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crocethia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02031897\"]}");
	add("{\"term\":\"crochet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03137530\"]}");
	add("{\"term\":\"crocheting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00911263\", \"03137530\"]}");
	add("{\"term\":\"crock\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03138066\", \"06620878\", \"14817703\"]}");
	add("{\"term\":\"crockery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03138189\"]}");
	add("{\"term\":\"crocket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03138395\"]}");
	add("{\"term\":\"crockett\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10935318\"]}");
	add("{\"term\":\"crocodile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01699819\"]}");
	add("{\"term\":\"crocodilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01698923\"]}");
	add("{\"term\":\"crocodilian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01699274\"]}");
	add("{\"term\":\"crocodilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01699643\"]}");
	add("{\"term\":\"crocodylia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01698923\"]}");
	add("{\"term\":\"crocodylidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01699490\"]}");
	add("{\"term\":\"crocodylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01699643\"]}");
	add("{\"term\":\"crocolite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14697193\"]}");
	add("{\"term\":\"crocus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12436928\"]}");
	add("{\"term\":\"crocuta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02120424\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }