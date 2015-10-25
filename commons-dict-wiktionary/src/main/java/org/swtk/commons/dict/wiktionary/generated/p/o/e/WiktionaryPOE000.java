package org.swtk.commons.dict.wiktionary.generated.p.o.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPOE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("poem", "{\"term\":\"poem\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027poème\u0027 from Latin \u0027poēma\u0027 from Ancient greek (to 1453) \u0027ποίημα\u0027 from \u0027ποιέω\u0027 (i make)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A literary piece written in verse\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dSome \u0027\u0027poems\u0027\u0027, echoing the purpose of early poetic treatises on scientific principles, attempt to elucidate the mathematical concepts that underlie prime numbers. Others play with primes’ cultural associations. Still others derive their structure from mathematical patterns involving primes\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A piece of writing in the tradition of poetry, an instance of poetry\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A piece of poetic writing, that is with an intensity or depth of expression or inspiration greater than is usual in prose\", \"priority\":4}]}, \"synonyms\":{}}");

	add("poes", "{\"term\":\"poes\", \"etymology\":{\"influencers\":[], \"languages\":[\"Afrikaans\", \"English\"], \"text\":\"From Afrikaans \u0027lang\u003daf|poes\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The female genitalia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A disliked person\", \"priority\":2}]}, \"synonyms\":{}}");

	add("poet", "{\"term\":\"poet\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) {{m|fro|poete}}, from Latin {{m|la|poēta||poet, author}}, from Ancient greek (to 1453) {{m|grc|ποιητής||creator, maker, author, poet}}, from {{m|grc|ποιέω||I make, compose}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who writes poems\", \"priority\":1}]}, \"synonyms\":{}}");

	add("poesy", "{\"term\":\"poesy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From the Middle french (ca. 1400-1600) \u0027poesie\u0027 from the \u0027poesia\u0027 from the Latin \u0027poēsis\u0027 from the Ancient greek (to 1453) {{m|grc|ποίησις}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A poem\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The class of literature comprising poems; poetry, verse\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"II.10\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"I know not well how to excuse him, in that hee deemed his \u0027\u0027Poesie\u0027\u0027 worthy to be published\", \"priority\":4}]}, \"synonyms\":{}}");

	add("poetaster", "{\"term\":\"poetaster\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"Borrowed from the \u0027poētaster\u0027 Equivalent to {{suffix|poet|aster|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unskilled poet\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1853\u0027\u0027, w:Henry Theodore Henry Theodore Tuckerman, [http://books.google.co.uk/books?id\u003d3uZkAAAAMAAJ\u0026amp;pg\u003dPA219 \u0027Mental Portraits; Or, Studies of Character\u0027], \u0027The Reviewer: w:Francis Jeffrey, Lord Lord Jeffrey\u0027, page 219\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Where the personal feelings were not engaged, it was also an agreeable pastime to follow his destructive feats; see him annihilate a \u0027\u0027poetaster\u0027\u0027, or insinuate away the pretensions of a book-wright\", \"priority\":3}]}, \"synonyms\":{}}");

	add("poetry", "{\"term\":\"poetry\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From French \u0027poetrie\u0027 from Latin \u0027poetria\u0027 from Ancient greek (to 1453) \u0027ποίησις\u0027 (poetry) from \u0027ποιέω\u0027 (i make, do, create)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The class of literature comprising poems\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Composition in verse or language exhibiting conscious attention to patterns\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A poet\u0027s literary productio\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A \u0027poetical\u0027 quality, artistic and/or artfull, which appeals or stirs the imagination, in any mediu\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"That \u0027Swan Lake\u0027 choreography is \u0027\u0027poetry\u0027\u0027 in motion, fitting the musical \u0027\u0027poetry\u0027\u0027 of Tchaikovski\u0027s divine score well beyond the literary inspiration\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }