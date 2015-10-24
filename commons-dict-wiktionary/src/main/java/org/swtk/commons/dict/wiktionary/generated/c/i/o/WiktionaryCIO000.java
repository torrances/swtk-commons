package org.swtk.commons.dict.wiktionary.generated.c.i.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCIO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cion", "{\"term\":\"cion\", \"etymology\":{\"influencers\":[], \"languages\":[\"frankish\", \"old french (842-ca. 1400)\"], \"text\":\"Frankish {{m|frk|*kiþ}}, cognate with English \u0027kid\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1621–1626\u0027\u0027 (published posthumously in \u0027\u00271627\u0027\u0027): w:Francis Francis Bacon, \u0027Sylva Sylvarum : or, A Natural History ; in ten centuries\u0027, century \u0026lt;small\u0026gt;V\u0026lt;/small\u0026gt;, \u0027Experiments in consort touching the putting back or retardation of germination\u0027, ¶ 421; reprinted in\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1838\u0027\u0027, \u0027The works of Lord Bacon : with an introductory essay, and a portrait ; in two volumes\u0027, volume 1, [http://books.google.co.uk/books?id\u003dhtUcAAAAMAAJ\u0026amp;pg\u003dPA133\u0026amp;dq\u003d%22cion+overruleth+the+stock%22\u0026amp;ei\u003dO-bjSYTtOJGuzQSY19GUD\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"PPA133,M1 page 133] (London : William Ball, Paternoster Row ; stereotyped and printed by John Childs and son\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"421. Men have entertained a conceit that showeth prettily ; namely, that if you graft a late-coming fruit upon a stock of a fruit-tree that cometh early, the graft will bear early ; as a peach upon a cherry ; and contrariwise, if an early-coming fruit upon a stock of a fruit-tree that cometh late, the graft will bear fruit late ; as a cherry upon a peach. But these are but imaginations, and untrue. The cause is, for that the \u0027\u0027cion\u0027\u0027 overruleth the stock quite : and the stock is but passive only, and giveth aliment, but no motion to the graft\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }